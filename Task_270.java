package Task_acmp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_270{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String varName = sc.nextLine();
        StringBuffer newVarName = new StringBuffer("Error!");

        if (varName.contains("_")) {
            Pattern pattern = Pattern.compile("^([a-z]+[_])+[a-z]+$");
            Matcher matcher = pattern.matcher(varName);
            if (matcher.matches()) {
                String words[] = varName.split("_");
                newVarName = new StringBuffer(words[0]);
                for (int i = 1; i < words.length; i++) {
                    newVarName.append((words[i].charAt(0) + "").toUpperCase());
                    newVarName.append(words[i].substring(1));
                }
            }
        } else {
            int i, pos1 = 0;
            Pattern pattern = Pattern.compile("^[a-z]+([A-Z][a-z]*)*$");
            Matcher matcher = pattern.matcher(varName);
            if (matcher.matches()) {
                newVarName = new StringBuffer();
                for (i = 0; i < varName.length(); i++) {
                    if (varName.charAt(i) >= 'A' && varName.charAt(i) <= 'Z') {
                        newVarName.append(varName, pos1, i).append("_");
                        pos1 = i;
                    }
                }
                newVarName.append(varName, pos1, i);
                newVarName = new StringBuffer(newVarName.toString().toLowerCase());
            }
        }
        System.out.println(newVarName);
    }
}

