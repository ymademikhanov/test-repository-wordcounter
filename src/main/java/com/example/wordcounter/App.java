package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
       	int counter = 0;
	int len = s.length();
	for (int i = 0; i < len; i++) {
		if (s.charAt(i) != ' ' && (i == len - 1 || s.charAt(i + 1) == ' '))
			counter++;
	}
	return counter;
    }
}
