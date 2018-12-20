public class Mnohoclen {
    private Mnohoclen(int... numbers) {       
    }
    private String adding(Mnohoclen... numbers2) {
        int theLongest = numbers2[0].length;
        for (int i = 1; i < numbers2.length; i++) {
            if (theLongest < numbers2[i].length) {
                theLongest = numbers2[i].length;
            }
        }
        for (int i = 0; i < theLongest; i++) {
            int[] sum = new int[theLongest];
            for (int j = 0; j < numbers2.length; j++) {
                sum[i] = sum[i] + numbers2[j][i];
            }
        }
        return sum;
    }
}