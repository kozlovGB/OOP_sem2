package OOP_sem2.dz;

import OOP_sem2.dz.controller.StudentControllerImpl;
import OOP_sem2.dz.controller.StudyGroupControllerImpl;
import OOP_sem2.dz.controller.TeacherControllerImpl;
import OOP_sem2.dz.util.ReaderFromTxt;
import OOP_sem2.dz.util.WriterToTxt;
import java.util.logging.Logger;

    public class Main {


        public static void main(String[] args) {
            Logger logger = Logger.getAnonymousLogger();
            StudentControllerImpl studentController = new StudentControllerImpl();
            studentController.create("Иван", "20.06.2001","012");
            studentController.create("Петя", "20.08.2001","014");
            studentController.create("Глаша", "20.05.2001","013");
            studentController.create("Маня", "20.11.2001","015");
            TeacherControllerImpl teacherController = new TeacherControllerImpl();
            teacherController.create("Иван", "20.06.1984","Математика");
            StudyGroupControllerImpl studyGroupController = new StudyGroupControllerImpl();
            studyGroupController.create(teacherController.get(),studentController.getAll());
            var s = (studyGroupController.get());
            System.out.println(s);
            WriterToTxt.write(studentController.getAll(),"text");
            logger.info(ReaderFromTxt.read("text").toString());

        }
    }
