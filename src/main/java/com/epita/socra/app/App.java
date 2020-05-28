package com.epita.socra.app;

import com.epita.socra.app.tools.Adapter.ConsoleAdapter;
import com.epita.socra.app.tools.Adapter.IOAdapter;
import com.epita.socra.app.tools.Translater.ArabicTranslater;
import com.epita.socra.app.tools.Translater.RomanTranslater;
import com.epita.socra.app.tools.Translater.Translater;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }




    public void run(){
        adapter.write("Arabic/Roman converter : Chose mode");
        String test = adapter.read();
        Translater Converter;
        if (test.equals("Arabic")){
            Converter = new RomanTranslater();
        }
        else {
            Converter = new ArabicTranslater();
        }
        while (true)
        {
            String input = adapter.read();
            if (input.equals("quit") || input.equals("EXIT")){
               break;
            }
            adapter.write(Converter.Translate(input));
        }
    }
}
