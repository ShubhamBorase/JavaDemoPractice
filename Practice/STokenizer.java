import java.io.*;
import java.util.*;
import java.lang.reflect.Field;

class STokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String token1 = st.nextToken();
        String token2 = st.nextToken();

        // Use reflection to explore potentially relevant fields:
        Field[] fields = st.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().getName().equals("long") || field.getType().getName().equals("int")) { // Focus on likely address-related fields
                try {
                    field.setAccessible(true);
                    Object addressValue = field.get(st);
                    System.out.println("Potential address-related value: " + addressValue);
                } catch (IllegalAccessException e) {
                    System.err.println("Cannot access field: " + field.getName());
                }
            }
        }

        System.out.println("Token 1 = "+token1);
		System.out.println("Token 2 = "+token2);
    }
}
