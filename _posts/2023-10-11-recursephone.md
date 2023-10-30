---
layout: post
title: "Recursion: Phone Numbers"
author:
- Tyler Le
---
This is the One Day Calculator project we started off the year with. The goal was to code a fully functioning text-based calculator all in one class period. The calculator uses 4 functions to complete two-number operations.

{% highlight ruby %}
import java.util.Scanner;

public class Beans3 {
   public static void main(String[] args) {
      //This is where the prompts lie.
      //Instantiates Scanner beans = new Scanner(System.in)
   }
   static float calcMaths(float first, float second, String opss) {
      //This is where the calculations actually run.
      if (opss.equals("+")){
         System.out.println("Adding " + first + " and " + second);
         return first + second;
     }else if (opss.equals("-")){}
     //...
   }
}
{% endhighlight %}

Check out the source code [here](https://github.com/TylerLeCmd/CPP2/tree/6cb1b9812b233ca611887f574f1d1b920e16fefe/src).
