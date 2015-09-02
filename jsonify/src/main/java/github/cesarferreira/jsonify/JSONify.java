package github.cesarferreira.jsonify;

import android.util.Log;

import com.google.gson.Gson;

public class JSONify {

    private static final int BUMP = 4;

    public static String from(Object o) {
        return from(o, false, false);
    }

    public static String from(Object o, boolean printFormated) {
        return from(o, printFormated, false);
    }


    public static void print(Object o) {
        from(o, true, true);
    }

    private static String from(Object o, boolean printFormatted, boolean isPrintable) {
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


        if (isPrintable) {
            String[] a = reconstruction.split("\n");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }

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
