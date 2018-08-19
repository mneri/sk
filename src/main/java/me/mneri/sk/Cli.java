package me.mneri.sk;

public class Cli {
    public static void main(String... args) {
        new Repl().loop(System.in, System.out);
    }
}
