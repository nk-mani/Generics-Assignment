import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections; import java.util.List;

public class Main { public static final <T> void swap (T[] a, inti, int j) {

Tt = a[i];

a[i] = a[i];

a[j] = = t;

}

public static final <T> void swap (List<T> I, int i, Collections.<T>swap(l, i, j);

int j) {

}

private static void test() {

String [] a = {"Hello", "Goodbye"}; swap(a, 0, 1);

System.out.println("a:"+Arrays.toString(a));

List<String> | = new ArrayList<String> (Arrays.asList(a));

swap(1, 0, 1);

System.out.println("I:"+l);

}

public static void main(String...args)

{

test();

}