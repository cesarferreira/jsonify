package github.cesarferreira.jsonify;

import com.google.gson.Gson;

public class JSONify {
    public static String from(Object o) {
        Gson g = new Gson();
        return g.toJson(o);
    }

    public static String frome(Object o) {
        Gson g = new Gson();
        String json = g.toJson(o);

        String reconstruction = "";

        int level = 0;

        for (int i = 0; i < json.length(); i++) {
            String current = String.valueOf(json.charAt(i));

            if (current.equals("{") || current.equals("[")) {
                level += 2;
                current = current + "\n" + getSpaces(level);
            }

            if (current.equals("}") || current.equals("]")) {
                level -= 2;
                current = "\n" + getSpaces(level) + current;
            }

            if (current.equals(",")) {
                current = current + "\n" + getSpaces(level);
            }

            reconstruction += current;

        }
        reconstruction = reconstruction.replace("\":","\" : ");


        return reconstruction;
    }

    private static String getSpaces(int level) {
        String spaces = "";
        for (int i = 1; i < level; i++) {
            spaces += " ";
        }
        return spaces;
    }


}
