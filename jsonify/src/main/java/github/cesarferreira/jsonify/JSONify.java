package github.cesarferreira.jsonify;

import com.google.gson.Gson;

public class JSONify {

    private static final int BUMP = 4;

    public static String from(Object o) {
        return from(o, false);
    }

    public static String from(Object o, boolean printFormatted) {
        Gson g = new Gson();
        String json = g.toJson(o);

        if (!printFormatted) {
            return json;
        }

        String reconstruction = "";

        int level = 0;

        for (int i = 0; i < json.length(); i++) {
            String current = String.valueOf(json.charAt(i));

            if (current.equals("{") || current.equals("[")) {
                level += BUMP;
                current = current + "\n" + getSpaces(level);
            }

            if (current.equals("}") || current.equals("]")) {
                level -= BUMP;
                current = "\n" + getSpaces(level) + current;
            }

            if (current.equals(",")) {
                current = current + "\n" + getSpaces(level);
            }

            reconstruction += current;

        }
        reconstruction = reconstruction.replace("\":", "\" : ");


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
