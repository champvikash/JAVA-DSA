package com.example.mycode.recursionpattern;

public class removeParticularcharfromstring {

    public static void main(String[] args) {
//       skip("", "bacapp");
        String str = "bacapp";
        char val = 'a';
        removecChar(str,val);
//        skipwihinBuiltFucton(str);
//        skipwihinBuiltFucton2(str);
//        skipwihinBuiltFucton3(str);
//        skipwihinBuiltFucton4(str);
//        skipwihinBuiltFucton5(str);
//        skipwihinBuiltFucton6(str);


    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }


    static void skipwihinBuiltFucton(String str) {


        String strNew = str.replace("a", "");

        System.out.println(strNew);

    }

    static void skipwihinBuiltFucton2(String str) {


        String strNew = str.replaceFirst("ab", "");

        System.out.println(strNew);

    }

    static void skipwihinBuiltFucton3(String str) {


        String strNew = str.replaceAll("([a-z])", "");

        System.out.println(strNew);

    }


    static void skipwihinBuiltFucton4(String str) {


        String strNew = str.replace(" ", "");

        System.out.println(strNew);
    }

    static void skipwihinBuiltFucton5(String str) {


        String strNew = str.substring(0, str.length() - 1);

        System.out.println(strNew);

    }

    static void skipwihinBuiltFucton6(String str) {


        String strNew = str.substring(0, str.length() - 1);

        System.out.println(strNew);

    }

    static void removeChar(String s, char c) {
        int j, count = 0, n = s.length();
        char[] t = s.toCharArray();
        for (int i = j = 0; i < n; i++) {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }

        while (count > 0) {
            t[j++] = '\0';
            count--;
        }

    }

    //Bruteforce

    public static void removecChar(String str, char val){
        char[] ch = new char[str.length()];
        int p = 0;


        for(int i=0; i< str.length(); i++){

            if(str.charAt(i) != val ){

                ch[p] = str.charAt(i);
                p++;
                if(str.length() == p){
                    break;
                }

            }


        }

        String string = String.valueOf(ch);
        System.out.print(string);

    }



}