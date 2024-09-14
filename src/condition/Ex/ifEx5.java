package condition.Ex;

public class ifEx5 {
    // 거리에 따른 운송 수단 선택하기
    public static void main(String[] args) {
        int distance = 108;

        String rst;
        if (distance <= 1) {
            rst = "도보";
        } else if (distance <= 10) {
            rst = "자전거";
        } else if (distance <= 100) {
            rst = "자동차";
        } else {
            rst = "비행기";
        }
        System.out.println(rst + "를 이용하세요.");
    }
}
