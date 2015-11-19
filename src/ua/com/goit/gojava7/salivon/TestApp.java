package ua.com.goit.gojava7.salivon;

import java.util.Random;
import ua.com.goit.gojava7.salivon.beans.Category;
import ua.com.goit.gojava7.salivon.beans.Faq;
import ua.com.goit.gojava7.salivon.beans.Project;
import ua.com.goit.gojava7.salivon.context.Console;

public class TestApp {

    public static void main(String[] args) {
        Console console = new Console();
        console.execute();
        
//        ManagerData md = new ManagerFileData();
//        ManagerData md = new ObjectDataManager();
//        
//        System.out.println(md.getRandomQuote());
//        
//        for (Category arg : md.getAllCategories()) {
//            System.out.println(arg.getId()+" "+arg.getName());
//        }
//        
//        System.out.println(md.getCategory(2).getName());
//        
//        System.out.println(md.getProject(8).getTitle());
//
//         for (Project arg : md.getProjectsOfCategory(2)) {
//            System.out.println(arg.getId()+" "+arg.getTitle());
//        }
//        md.saveFaq(new Faq(2, "And You?"));
//        
//        System.out.println(md.getFaq(8));
    }

}
