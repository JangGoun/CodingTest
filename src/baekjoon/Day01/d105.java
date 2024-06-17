package baekjoon.Day01;

import java.util.Scanner;

public class d105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (0<a && b<10){
            System.out.println(a/b);
        }

        sc.close();
    }
}

//float (단정밀도 부동 소수점)
//크기: 32비트 (4바이트)
//정밀도: 소수점 이하 약 7자리의 정확도
//범위: 약 1.4E-45에서 3.4E38까지
//사용 예: 메모리가 제한된 환경에서, 매우 높은 정밀도가 필요하지 않은 경우

//double (배정밀도 부동 소수점)
//크기: 64비트 (8바이트)
//정밀도: 소수점 이하 약 15자리의 정확도
//범위: 약 4.9E-324에서 1.8E308까지
//사용 예: 대부분의 경우, 특히 과학 계산이나 금융 계산 등에서 높은 정밀도가 필요한 경우

//주요 차이점
//정밀도: double은 float보다 두 배의 정밀도를 가집니다. 이는 float이 소수점 이하 7자리 정도의 정확도를 가지는 반면, double은 약 15자리 정도의 정확도를 가집니다.
//범위: double은 float보다 훨씬 넓은 범위의 값을 표현할 수 있습니다.
//메모리 사용량: float은 4바이트를 사용하고, double은 8바이트를 사용합니다. 따라서, 메모리가 중요한 상황에서는 float을 사용하는 것이 더 적합할 수 있습니다.
//계산 성능: 일부 시스템에서는 float이 double보다 계산이 빠를 수 있지만, 현대의 대부분의 프로세서는 double 연산도 매우 효율적으로 처리할 수 있습니다.

//        선택 기준
//메모리 효율성: 메모리가 중요한 시스템(예: 임베디드 시스템)에서는 float을 사용할 수 있습니다.
//정밀도 요구: 높은 정밀도가 필요한 계산에서는 double을 사용하는 것이 좋습니다.
//일반적인 사용: 특별한 이유가 없는 한, double을 사용하는 것이 더 안전하고 편리합니다.
