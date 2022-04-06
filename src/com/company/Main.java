package com.company;

import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        List<String> numStr = new ArrayList<>();
        String str = i.nextLine();
        numStr = Arrays.asList(str.split(" "));
        List<Integer> num =new ArrayList<>(); 
        for (int j = 0; j < numStr.size(); j++) {
            num.add(Integer.parseInt(numStr.get(j)));
        }
        Collections.sort(num);
        for (int j = 0; j < num.size()-1; j++)
        {
            System.out.print(num.get(j)+", ");

        }
        System.out.println(num.get(num.size()-1));
    }
}

