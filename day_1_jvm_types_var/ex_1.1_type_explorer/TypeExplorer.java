class TypeExplorer {

    public static void main(String[] args) {
        int num = 42;
        long num2 = 9_999_999_999L;
        double num3 = 3.14159;
        boolean decide = true;
        char letter = 'A';
        String str = "Hello Java";
        int sum = 42 + 8;
        double divide = (double) 100 / 3;
        boolean confirm = str.contains("Java");

        System.out.println("num: " + num);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("decide: " + decide);
        System.out.println("letter: " + letter);
        System.out.println("str: " + str);
        System.out.println("sum: " + sum);
        System.out.println("divide: " + divide);
        System.out.println("confirm: " + confirm);
    }
}
