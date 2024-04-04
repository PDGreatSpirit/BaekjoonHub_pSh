import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Student student = new Student(st.nextToken()
                    , Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken()));

            list.add(student);
        }
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name);
        }
    }

    public static class Student implements Comparable<Student> {
        String name;
        int korean;
        int eng;
        int math;

        public Student(String name, int korean, int eng, int math) {
                this.name = name;
                this.korean = korean;
                this.eng = eng;
                this.math = math;
        }


        @Override
        public int compareTo(Student o2) {
            if (this.korean > o2.korean) return -1;
            else if (this.korean < o2.korean) return 1;
            else {
                if (this.eng > o2.eng) return 1;
                else if (this.eng < o2.eng) return -1;
                else {
                    if(this.math > o2.math) return -1;
                    else if(this.math < o2.math) return 1;
                    else return this.name.compareTo(o2.name);
                }
            }
        }
    }
}