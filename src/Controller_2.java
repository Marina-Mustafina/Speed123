import java.time.Duration;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller_2 {
    @FXML
    private ImageView car1,car2,car3,car4,car6,car5;

    @FXML
    private ProgressBar pb1,pb2,pb3,pb4,pb5,pb6,pb7;

    @FXML
    private TextField tx1,tx3,tx2,tx4,tx5,tx6;

    private static boolean run1=false;

    private static boolean run2=false;

    private static boolean run3=false;

    private static boolean run4=false;

    private static boolean run5=false;

    private static boolean run6=false;

    private static boolean gunWork=true;
    private static boolean fuelHave=true;

    private static double gasoil=1;


    
    public void working(){
      
        pb7.setProgress(1);

        new Thread(() -> { // поток первой заправки
            while(true){
            try {
                Thread.sleep(100); // перед запуском всех машин, иначе не запуститься после аварийной ситуации
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace(); // если ошибка, то вывод ее
            }
            if ((!run1)&&(fuelHave)){ // если не запущено
            tx1.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000); // запуск машины
            } catch (InterruptedException e) { // true catch  методов sleep класса thread
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car1.setVisible(true);
            double x=randInt(5, 10)*0.01; // коэффициент скорости заливки
            double cof=1; // коэф для литров
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5; // большая скорость, меньше литров
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx1.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500); // заливка pb по уровням
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Первая колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb1.setProgress(i); 
            }
            setGasoil(x*cof);
            car1.setVisible(false);
            tx1.setText("Заправка завершилась");
            System.out.println("Первая колонка завершила заливку");
            pb1.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();
    
        new Thread(() -> {
            while(true){
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if ((!run2)&&(fuelHave)){
            tx2.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car2.setVisible(true);
            double x=randInt(5, 10)*0.01;
            double cof=1;
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5;
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx2.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Вторая колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb2.setProgress(i);
            }
            setGasoil(x*cof);
            car2.setVisible(false);
            tx2.setText("Заправка завершилась");
            System.out.println("Вторая колонка завершила заливку");
            pb2.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();
    
        new Thread(() -> {
            while(true){
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if ((!run3)&&(fuelHave)){
            tx3.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car3.setVisible(true);
            double x=randInt(5, 10)*0.01;
            double cof=1;
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5;
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx3.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Третья колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb3.setProgress(i);
            }
            setGasoil(x*cof);
            car3.setVisible(false);
            tx3.setText("Заправка завершилась");
            System.out.println("Третья колонка завершила заливку");
            pb3.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();
    
        new Thread(() -> {
            while(true){
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if ((!run4)&&(fuelHave)){
            tx4.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car4.setVisible(true);
            double x=randInt(5, 10)*0.01;
            double cof=1;
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5;
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx4.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Четвертая колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb4.setProgress(i);
                
            }
            setGasoil(x*cof);
            car4.setVisible(false);
            tx4.setText("Заправка завершилась");
            System.out.println("Четвертая колонка завершила заливку");
            pb4.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();
    
        new Thread(() -> {
            while(true){
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if ((!run5)&&(fuelHave)){
            tx5.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car5.setVisible(true);
            double x=randInt(5, 10)*0.01;
            double cof=1;
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5;
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx5.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Пятая колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb5.setProgress(i);
            }
            setGasoil(x*cof);
            car5.setVisible(false);
            tx5.setText("Заправка завершилась");
            System.out.println("Пятая колонка завершила заливку");
            pb5.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();
        
        new Thread(() -> {
            while(true){
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if ((!run6)&&(fuelHave)){
            tx6.setText("Ожидание машины");
            try {
                Thread.sleep(randInt(0,5)*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            car6.setVisible(true);
            double x=randInt(5, 10)*0.01;
            double cof=1;
            if (x>0.09) cof=0.5;
            if ((x<=0.09)&&(x>0.08)) cof=0.5;
            if ((x<=0.08)&&(x>0.07)) cof=0.8;
            if ((x<=0.07)&&(x>=0.06)) cof=1.5;
            if ((x<=0.06)&&(x>=0.05)) cof=2;
            tx6.setText("Заправка машины "+x*1000*cof+" л.");
            for (double i=0;i<=1;i=i+x){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                while(!gunWork){
                    if (gunWork) break;
                    System.out.println("Шестая колонка сломана");
                }
                while(!fuelHave){
                    if (fuelHave) break;
                    System.out.println("Топлива нет");
                }
                pb6.setProgress(i);
            }
            setGasoil(x*cof);
            car6.setVisible(false);
            tx6.setText("Заправка завершилась");
            System.out.println("Шестая колонка завершила заливку");
            pb6.setProgress(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (getGasoil()<0.1){
                    noFuel();
                }
                pb7.setProgress(getGasoil());
            }
        }).start();
    }

    
    
    @FXML
    private void initialize() throws InterruptedException{
        System.out.println("Заправочная станция \"Speed without Limits\" открылась!");

        car1.setVisible(false);
        car2.setVisible(false);
        car3.setVisible(false);
        car4.setVisible(false);
        car5.setVisible(false);
        car6.setVisible(false);
        
        working();
    }

    @FXML
    private void onClickFuel(ActionEvent event){
        yesFuel();
    }
    
    private static int randInt(int x,int y){
        Random random = new Random();
        int randomInteger = random.nextInt(y - x + 1) + x;
        return randomInteger;
    }

    static void setSit(){
        run1=true;
        run2=true;
        run3=true;
        run4=true;
        run5=true;
        run6=true;
    }

    static void setSuccess(){
        run1=false;
        run2=false;
        run3=false;
        run4=false;
        run5=false;
        run6=false;
    }

    static void setGunWorkFalse(){
        gunWork=false;
    }

    static void setGunWorkTrue(){
        gunWork=true;
    }

    static void setGasoil(double litr){
        gasoil=gasoil-litr;
    }

    static double getGasoil(){
        return gasoil;
    }

    static void yesFuel(){
        gasoil=1;
        fuelHave=true;
    }

    static void noFuel(){
        fuelHave=false;
    }
}

