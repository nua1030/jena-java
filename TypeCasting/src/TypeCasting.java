public class TypeCasting {
    public static void main(String[] args) {
        // 주어진 값들
        double doubleValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력
        System.out.println("\n=== double 형변환 ===");
        System.out.println("1. double -> byte: " + (byte)doubleValue);
        // 바이트로 변환될 때, 소수점은 버려지고 정수만 남는다.
        System.out.println("2. double -> short: " + (short)doubleValue);
        // 소수점은 버려지고 정수만 남는다.
        System.out.println("3. double -> int: " + (int)doubleValue);
        // 소수점은 버려지고 정수만 남는다.
        System.out.println("4. double -> long: " + (long)doubleValue);
        // 소수점은 버려지고 정수만 남는다.
        System.out.println("5. double -> float: " + (float)doubleValue);
        // 2.71828 그대로 변환 가능해서 뒤에 f만 붙인다.
    }
}
