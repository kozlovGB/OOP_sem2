package OOP_sem2.dz;

import OOP_sem2.dz.controller.StudentControllerImpl;
import OOP_sem2.dz.controller.StudyGroupControllerImpl;
import OOP_sem2.dz.controller.TeacherControllerImpl;
import OOP_sem2.dz.data.User;
import OOP_sem2.dz.util.Flow;
import OOP_sem2.dz.util.ReaderFromTxt;
import OOP_sem2.dz.util.WriterToTxt;
import OOP_sem2.dz.data.StudyGroup;

import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

    public class Main {


        public static void main(String[] args) {
            Logger logger = Logger.getAnonymousLogger();
            StudentControllerImpl studentController1 = new StudentControllerImpl();
            studentController1.create("Иван", "20.06.2001","012");
            studentController1.create("Петя", "20.08.2001","014");
            studentController1.create("Глаша", "20.05.2001","013");
            studentController1.create("Маня", "20.11.2001","015");
            TeacherControllerImpl teacherController1 = new TeacherControllerImpl();
            teacherController1.create("Иван", "20.06.1984","Математика");
            StudyGroupControllerImpl studyGroupController1 = new StudyGroupControllerImpl();
            studyGroupController1.create(teacherController1.get(),studentController1.getAll());
            StudentControllerImpl studentController2 = new StudentControllerImpl();
            studentController2.create("Иван", "20.06.2001","01");
            studentController2.create("Петя", "20.08.2001","04");
            studentController2.create("Глаша", "20.05.2001","03");
            studentController2.create("Маня", "20.11.2001","05");
            TeacherControllerImpl teacherController2 = new TeacherControllerImpl();
            teacherController2.create("Иван", "20.06.1984","Матем");
            StudyGroupControllerImpl studyGroupController2 = new StudyGroupControllerImpl();
            studyGroupController2.create(teacherController2.get(),studentController2.getAll());

            Flow flow = new Flow();
            flow.addFlow(studyGroupController1.get());
            flow.addFlow(studyGroupController2.get());
            System.out.println(flow.toString());

            //var s = (studyGroupController.get());
            //System.out.println(s);
            //WriterToTxt.write(studentController.getAll(),"text");
            //logger.info(ReaderFromTxt.read("text").toString());

            while (flow.hasNext()){

                System.out.println(flow.next());
            }
        }
    }
