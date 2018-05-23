public class Main {

    public static void main(String[] args) {
        Translate translator = new Translate();
        translator.fillMap();
        translator.morseToString("-.-- --- ..- / --. ..- -.-- ... / .- .-. . / --. .-. . .- - / .- - / .--- .- ...- .- / --- -- --. / -.-- --- ..- ·----· .-. . / ... --- / -.-. --- --- .-..");
        translator.stringToMorse("THIS is A TEST");
        //translator.printMorse("...---...--");
    }
}
