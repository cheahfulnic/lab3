# Topic: Web Servers, Bugs and Troubleshooting

## Part 1: StringServer Web Server
For the first part of this week's lab report, I'm creating a web server called StringServer that supports the path and behavior described on this [link](https://ucsd-cse15l-w23.github.io/week/week3/#part-1).

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-13.png?raw=true)
*Code for StringServer.java that takes an argument in main, creates a URLHandler and then uses Server.java to start the web server.*

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-14.png?raw=true)
*Code for Server.java which was used in week 2's lab. More information can be found on this [link](https://ucsd-cse15l-w23.github.io/week/week2/#the-urlhandler-interface).*

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-15.png?raw=true)
*First instance of using /add-message.*
* Before using '/add-message', the first method called is the Server class' start method (and createContext method) which takes a port number and a Handler object as arguments.
* This instantiation then calls StringServer class' overridden handleRequest method which takes a URL as the argument. The value of the URL is a variation of http://localhost:4000/, whereby the port number (4000) is a numeric value given as an argument to StringServer's main method and a path name can be written after the last '/' sign.
* Then, the URI class' getPath method is called. For this code, only the values '/' and '/add-message' for the path name are valid.
* The getQuery method is called if the the path is '/add-message'. Note: The String class' contains and equals method are used to compare the path and query.
* If the part of the query before the '=' sign is 's', the String following the '=' sign is printed on the web page. 


![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-16.png?raw=true)
*Second instance of using /add-message*
* Since the port number didn't change, the second instance starts by calling the handleRequest method. The getQuery method is also called after the getPath method because the path name didn't change.
* However, the query value for this particular example differs from the first image. Instead of "My first message!", the String "then the second!" is now part of the query value. And because the '/add-message' path was used and a prior String was already printed, the String following the '=' sign is now printed on the next line.

## Part 2: Bugs and Troubleshooting
For the second part of this week's lab report, I'll be choosing and troubleshooting a bug from week 3's lab which can be found on this [link](https://ucsd-cse15l-w23.github.io/week/week3/#symptoms-and-failure-inducing-inputs). The particular bug I'll be fixing is the averageWithoutLowest method, which returns the average of all numbers in a given array excluding the smallest number, in the ArrayExamples.java file.
```
@Test
public void testAverageWithoutLowest() {
  double[] input1 = { 1 , 1 , 2 , 2 };
  assertEquals(5.0/3, ArrayExamples.averageWithoutLowest(input1), 0.001);
}
```
*A failure-inducing input*

```
@Test
public void testAverageWithoutLowest2() {
  double[] input2 = { 1 , 1 , 0 , 0 };
  assertEquals(2.0/3, ArrayExamples.averageWithoutLowest(input2), 0.001);
}
```
*An input that doesn't induce a failure*

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-11.png?raw=true)
*The symptom*

```
static double averageWithoutLowest(double[] arr) {
  if(arr.length < 2) { return 0.0; }
  double lowest = arr[0];
  for(double num: arr) {
    if(num < lowest) { lowest = num; }
  }
  double sum = 0;
  for(double num: arr) {
    if(num != lowest) { sum += num; }
  }
  return sum / (arr.length - 1);
}
```
*The bug (before code change)*

```
static double averageWithoutLowest(double[] arr) {
  if(arr.length < 2) { return 0.0; }
  double lowest = arr[0];
  for(double num: arr) {
    if(num < lowest) { lowest = num; }
  }
  double sum = 0;
  for(double num: arr) {
    sum += num;
  }
  sum -= lowest;
  return sum / (arr.length - 1);
}
```
*The fixed code (after code change)*
* The code change sums up all the numbers in the array and then deducts the smallest number before averaging the result. This fixes the bug as the code prior to the change considers multiple instances of the smallest number and doesn't include all of them in the sum (which is incorrect as only one number should be excluded, i.e. one instance of the smallest number).

## Part 3: Reflection
In week 2 and 3's labs, I learnt how to: 
1. Use GitHub Desktop and git clone
2. Build and run a web server on a remote computer
3. Write JUnit tests and fix bugs
