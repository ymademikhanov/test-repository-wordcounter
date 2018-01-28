package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
       	int counter = 0;
	int length = s.length();
	for (int i = 0; i < length; i++) {
		if (s.charAt(i) != ' ' && (i == length - 1 || s.charAt(i + 1) == ' '))
			counter++;
	}
	return counter;
    }
}
