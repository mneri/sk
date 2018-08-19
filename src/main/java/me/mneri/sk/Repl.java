package me.mneri.sk;

import java.io.*;

public class Repl {
    public void loop(InputStream in, OutputStream out) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line;

        try {
            reader = new BufferedReader(new InputStreamReader(in));
            writer = new BufferedWriter(new OutputStreamWriter(out));

            writer.write("Interactive mode (<Ctrl-D> to end):\n");
            writer.flush();

            while ((line = reader.readLine()) != null)
                SK.print(SK.eval(SK.read(line)));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //@formatter:off
            if (reader != null)
                try { reader.close(); } catch (Exception ignored) { }

            if (writer != null)
                try { writer.close(); } catch (Exception ignored) { }
            //@formatter:on
        }
    }
}
