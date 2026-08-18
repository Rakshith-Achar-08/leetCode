# Important method in each problems.

1. `startsWith();` : [LongestCommonPrefix].
2. `ListNode`: Important class used in [AddTwoNumber].
3. `chatAt(i);`: [RomanConverter],[ValidParanthesis].
4. `toCharArray();`: [ValidParenthesis].
5. `containsKey(abcd);`: [ValidParenthesis].
6. `containsValues(abcd);`: [ValidParenthesis]







# Important logics I guess

1. `Reversing the string`
```
String s = "Geeks";
String r = "";
char ch;
for (int i = 0; i < s.length(); i++) {
    // extracts each character
    ch = s.charAt(i);
    // adds each character in
    // front of the existing string
    r = ch + r;
}
System.out.println(r);
```

2. `String to character using stack`
```aiignore
String name = "Hello";
        Stack<Character>stack=new Stack<>();

        for(int i =0;i<name.length();i++){
            stack.push(name.charAt(i));
        }

        System.out.println(stack);
```

3. 