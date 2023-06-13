import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
 try {

HashMap<String, HashMap<String, Object>> healthData = new HashMap<>();

        // 개인별 정보를 HashMap으로 저장하고, 이를 다시 healthData에 저장
        HashMap<String, Object> person1 = new HashMap<>();
        person1.put("성별", "남");
        person1.put("나이", 30);
        person1.put("키 (cm)", 175);
        person1.put("체중 (kg)", 75);
        person1.put("혈압 (mmHg)", "120/80");
        person1.put("혈당 (mg/dL)", 90);
        person1.put("검진 결과", "비정상");
        ArrayList<String> person1Recheck = new ArrayList<>();
        person1Recheck.add("폐암");
        person1Recheck.add("갑상선 질환");
        person1.put("재검진 항목", person1Recheck);
        healthData.put("홍길동", person1);

        HashMap<String, Object> person2 = new HashMap<>();
        person2.put("성별", "여");
        person2.put("나이", 25);
        person2.put("키 (cm)", 160);
        person2.put("체중 (kg)", 55);
        person2.put("혈압 (mmHg)", "110/70");
        person2.put("혈당 (mg/dL)", 85);
        person2.put("검진 결과", "비정상");
        ArrayList<String> person2Recheck= new ArrayList<>();
        person2Recheck.add("간암");
        person2Recheck.add("뇌졸중");
        person2.put("재검진 항목", person2Recheck);
        healthData.put("김영희", person2);

        HashMap<String, Object> person3 = new HashMap<>();
        person3.put("성별", "남");
        person3.put("나이", 45);
        person3.put("키 (cm)", 180);
        person3.put("체중 (kg)", 85);
        person3.put("혈압 (mmHg)", "130/85");
        person3.put("혈당 (mg/dL)", 100);
        person3.put("검진 결과", "정상");
        ArrayList<String> person3Recheck = new ArrayList<>();
        person3Recheck.add("심장질환");
        person3.put("재검진 항목", person3Recheck);
        person3.put("유지 방안", "식습관 개선, 운동 계획");
        healthData.put("박철수", person3);

        HashMap<String, Object> person4 = new HashMap<>();
        person4.put("성별", "여");
        person4.put("나이", 35);
        person4.put("키 (cm)", 165);
        person4.put("체중 (kg)", 60);
        person4.put("혈압 (mmHg)", "115/75");
        person4.put("혈당 (mg/dL)", 95);
        person4.put("검진 결과", "비정상");
        ArrayList<String> person4Recheck = new ArrayList<>();
        person4Recheck.add("간암");
        person4Recheck.add("알츠하이머병");
        person4.put("재검진 항목", person4Recheck);
        healthData.put("이지은", person4);

        HashMap<String, Object> person5 = new HashMap<>();
        person5.put("성별", "남");
        person5.put("나이", 28);
        person5.put("키 (cm)", 170);
        person5.put("체중 (kg)", 70);
        person5.put("혈압 (mmHg)", "125/80");
        person5.put("혈당 (mg/dL)", 92);
        person5.put("검진 결과", "정상");
        ArrayList<String> person5Recheck = new ArrayList<>();
        person5Recheck.add("간암");
        person5.put("재검진 항목", person5Recheck);
        healthData.put("최민호", person5);

   
      
  // 결과 출력
            String name = "홍길동";
            HashMap<String, Object> personData = healthData.get(name);
            if (personData != null) {
                System.out.println("개인별 정보:");
                for (String key : personData.keySet()) {
                    System.out.println(key + ": " + personData.get(key));
                }
            } else {
                System.out.println("해당 이름의 개인 정보를 찾을 수 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

