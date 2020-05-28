package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import java.util.Arrays;
import java.util.List;

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
        while (true)
        {
            String input = adapter.read();
            if (input.equals("quit") || input.equals("EXIT")){
               break;
            }
            if (test.equals("Arabic")) {
                adapter.write(RomanTranslater.TranslateToRoman(input));
            }
            else if (test.equals("Roman"))
            {
                //TODO
                adapter.write(ArabicTranslater.TranslateToArabic(input));
            }
            else {
                adapter.write("Unimplemented feature");
                break;
            }
        }
    }
}
