# Scanner class
When we call the `sc.nextLine()` it take the input until we type `enter` and the "\n" tells that the line is finished but when we do the `sc.nextInt()` it takes the int values but not drop the `\n` special character so the scanner already have the `\n`.
After the taking int value when we try to take another string as input it simply takes the `\n` and returns so to avoid this behavior we can do before taking the input first write the `sc.nextLine()` method which remove the `\n`.

for more info. refer to [inputs.java](./Inputs.java)