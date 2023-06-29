package Chapter1;

public class PhraseOMatic {
    public static void main (String[] args){
        String[] wordListFirst = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win",
        "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListSecond = {"empowered", "sticky", "value-added", "oriented", "centric",
        "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
        "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThird = {"process", "tipping-point", "solution", "architecture",
        "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int fLn = wordListFirst.length;
        int sLn = wordListSecond.length;
        int tLn = wordListThird.length;

        int rand1 = (int) (Math.random() * fLn);
        int rand2 = (int) (Math.random() * sLn);
        int rand3 = (int) (Math.random() * tLn);

        String phrase = wordListFirst[rand1] + " " + wordListSecond[rand2] + " " + wordListThird[rand3];

        System.out.println("What we need is a " + phrase);

    }
}
