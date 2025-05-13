public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0; // 합계를 저장할 변수 초기화

        // 1부터 1000까지 반복
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) { // 짝수인지 확인 (2로 나눈 나머지가 0이면 짝수)
                sum += i; // 짝수라면 sum에 더함
            }
        }

        // 최종 결과 출력
        System.out.println("1부터 1000까지 짝수의 합: " + sum);
    }
}
