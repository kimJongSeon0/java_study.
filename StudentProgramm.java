

class SaveStudenData {

    
    int studentNum;
    String studentName;
    double logicScore, clanScore, cppScore, javaScore, csScore;
    double []studenScore;
    
    public void setStudenData(int Num, String Name, double score1, double score2, double score3, double score4, double score5){
        this.studentName = Name;
        this.studentNum = Num;    
        this.logicScore = score1;
        this.clanScore = score2;
        this.cppScore = score3;
        this.javaScore = score4;
        this.csScore = score5;
    }

    String getStudentName(){
        String studentName;
        studentName ="안녕 + 잘가 + 바이";
        return studentName;
    }
    
    double getStudentAverage(){
        double totalScore;
        totalScore = logicScore + clanScore + cppScore + javaScore + csScore;
        totalScore = totalScore / 5;
        return totalScore;
    }
    double getStudentTotalScore(){
        return
        logicScore + clanScore + cppScore + javaScore + csScore;
    }
    double getStudentScore(String className){
        if (className == "논리회로") {
            return logicScore;
        }else if(className == "C언어"){
            return clanScore;
        }else if(className == "C++언어"){
            return cppScore;
        }else if(className == "자바언어"){
            return javaScore;
        }else if(className == "컴퓨터개론"){
            return csScore;
        }else{
            return 404;
        }
    }
    // String getStudent(){
    //     return 
    //     studentName+ studentName2+ studentName3;
    // }
}



    

public class StudentProgramm {
    
    public static void main(String[] args) {
        SaveStudenData studenData = new SaveStudenData();
        SaveStudenData studenData2 = new SaveStudenData();
        SaveStudenData studenData3 = new SaveStudenData();



        studenData.setStudenData(12345678, "안녕", 50, 60, 70, 80, 90);
        studenData2.setStudenData(12345678, "잘가", 40, 60, 80, 80, 100);
        studenData3.setStudenData(12345678, "바이", 100,100,100,100,100);

        // System.out.println(studenData.getStudent());
        // System.out.println(studenData2.getStudent());
        // System.out.println(studenData3.getStudent());
        
        
        System.out.println(studenData.getStudentScore("논리회로"));
        System.out.println(studenData2.getStudentScore("논리회로"));
        System.out.println(studenData3.getStudentScore("논리회로"));
        // System.out.println(studenData.getStudentScore("C언어"));
        // System.out.println(studenData2.getStudentScore("C언어"));
        // System.out.println(studenData3.getStudentScore("C언어"));
        

        System.out.println(studenData.getStudentAverage());
        System.out.println(studenData2.getStudentAverage());
        System.out.println(studenData3.getStudentAverage());

        System.out.println(studenData.getStudentTotalScore());
        System.out.println(studenData2.getStudentTotalScore());
        System.out.println(studenData3.getStudentTotalScore());

    }
}


//class = 설계도