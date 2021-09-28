import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {
        // question - 1)
        //part - 1)
        ArrayList<int[]> arr = new ArrayList<int[]>(); // this is the list containing all the [l,r].
        int[] minnie = new int[]{-2, 5, -1};
        int[] mickey = new int[]{-2, 2}; // range of number mickey likes.
        int count = 0;
        for (int i = 0; i < minnie.length; i++) {
            int sum = 0;
            for (int j = i; j < minnie.length; j++) {
                sum += minnie[j];
                if ((sum >= -2) && (sum <= 2)) {
                    arr.add(new int[]{i, j});
                    count++;
                }
            }


        }
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }

        // part - 2) // (improvise it).

        int sumPrev = 0;
        int sumNext = 0;
        int m1;
        int m2;

        // question - 2)

        //part - 1)

        List<String> rahulArrival = new ArrayList<String>();
        rahulArrival.add("0850");
        rahulArrival.add("0930");
        rahulArrival.add("1021");
        rahulArrival.add("1125");

        List<Integer> MinimumWaitingTime = new ArrayList<Integer>();

        List<String[]> Busschedule = new ArrayList<String[]>();
        Busschedule.add(new String[]{"0900", "1000"});
        Busschedule.add(new String[]{"1100", "1130"});
        Busschedule.add(new String[]{"1030", "1100"});
        Busschedule.add(new String[]{"0930", "1030"});

        for (String time : rahulArrival) {
            int t = Integer.parseInt(time);
            int MinTime = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < Busschedule.size(); i++) {
                int boardingTime = Integer.parseInt(Busschedule.get(i)[0]);
                int waitingTime = boardingTime - t;
                if (waitingTime >= 0) {
                    if (MinTime >= waitingTime) {
                        MinTime = waitingTime;
                        minIndex = i;
                    }
                }

            }
            MinimumWaitingTime.add(minIndex);

        }

        System.out.println(MinimumWaitingTime);

        // part - 1) done....

        // part - 2))

        List<Double> travelTime = new ArrayList<Double>();
//        travelTime.add(2.0);
//        travelTime.add(1.0);
//        travelTime.add(1.45);
//        travelTime.add(1.20);
//
        List<Integer> Earliest = new ArrayList<Integer>();

        for (String time : rahulArrival) {
            int t = Integer.parseInt(time);
            double minTime = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < Busschedule.size(); i++) {

                int waitingTime = Integer.parseInt(Busschedule.get(i)[0]) - t;
                if (waitingTime >= 0) {
                    double duration = Double.parseDouble(Busschedule.get(i)[1]) + travelTime.get(i) * 100;
                    if (minTime >= duration) {
                        minTime = duration;
                        minIndex = i;
                    }

                }
            }
            Earliest.add(minIndex);
//
//
//
//        }
//        System.out.println(Earliest);


        }


    }

}
