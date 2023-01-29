# Topic: Web Servers, Bugs and Troubleshooting

## Part 1: StringServer Web Server
For this week's lab report, I'm creating a web server called StringServer that supports the path and behavior described at the bottom of this [link]([https://sdacs.ucsd.edu/~icc/index.php](https://ucsd-cse15l-w23.github.io/week/week3/#week3-lab-report).

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-13.png?raw=true)
Code for StringServer that takes an argument in main, creates a URLHandler and then uses Server.java to start the web server.

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-14.png?raw=true)
Code for Server.java which was used in week 2's lab. More information can be found on this [link](https://ucsd-cse15l-w23.github.io/week/week2/#the-urlhandler-interface).

![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-15.png?raw=true)
First instance of using /add-message.
* The first method called is the Server class' start method (and createContext method) which takes a port number and a Handler object as arguments.
* This instantiation then calls StringServer class' overridden handleRequest method which takes a URL as the argument. The value of the URL is a variation of http://localhost:4000/, whereby the port number (4000) is a numeric value given as an argument to StringServer's main method and a path name can be written after the last '/' sign.
* Then, the URI class' getPath method is called. For this code, only the values '/' and '/add-message' for the path name are valid.
* The getQuery method is called if the the path is '/add-message'. Note: The String class' contains and equals method are used to compare the path and query.
* If the part of the query before the '=' sign is 's', the String following the '=' sign is printed on the web page. 


![image](https://github.com/cheahfulnic/lab3/blob/main/wk3-ss/week3-16.png?raw=true)
* The methods called are the same as the image above.
* However, since the /add-message path was used and a String was already printed before, the String following the '=' sign is now printed on the next line.
* The query value for this particular example differs from the first image. Instead of "My first message!", the String "then the second!" is now part of the query value.

## Part 2: Bugs and Troubleshooting
1. Open up a new terminal by clicking on Terminal -> New Terminal in the menu bar.
2. Enter the following code (leaving out the $)
> $ ssh cs15lwi23xxx@ieng6.ucsd.edu
* The xxx should be replaced by your own personal id (which can be found using this [link](https://sdacs.ucsd.edu/~icc/index.php))
* The link above should also detail how to change your password for the course-specific account.
* Important tips: Choose 'NO' when asked to change your MyTritonLink password and "YES" when asked to change your course-specific account passwords.
3.  When asked whether you wish to continue connecting to the new server, enter “yes” into the terminal.
4. You will then be prompted to enter your password to your course-specific account. Despite typing it in, you will not be able to see the password (but it’s there!). Click enter.
5. Your computer (the client) should now be connected to the computer in the CSE Basement (the remote server). You should see something like the image below.

![image](https://raw.githubusercontent.com/cheahfulnic/cse15l-lab-reports/main/step2image.png)


## Step 3: Trying Some Commands
1. Go ahead and type in a couple of commands that you’ve learnt up until now. Here are a couple of examples (sourced from the CSE15L teaching staff) if you’re having trouble remembering:
*  `cd`, `ls`, `pwd`, `mkdir`, and `cp`. You can also log out of the remote terminal using `exit` or clicking Ctrl+D.
*  Alternatively (and more specifically):
```
cd ~
cd
ls -lat
ls -a
ls <directory> where <directory> is /home/linux/ieng6/cs15lwi23/cs15lwi23xxx #where the xxx is another student’s username
cp /home/linux/ieng6/cs15lwi23/public/hello.txt ~/
cat /home/linux/ieng6/cs15lwi23/public/hello.txt
```
2. If you’ve done everything right so far, you should get a similar result as the ones below.

![image](https://raw.githubusercontent.com/cheahfulnic/cse15l-lab-reports/main/step3image.png)

3. You’re all set! Enjoy the rest of the quarter!
