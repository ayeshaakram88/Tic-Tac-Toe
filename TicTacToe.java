package application;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox; 
import javafx.scene.shape.Rectangle; 
import javafx.scene.Group; 
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class TicTacToe extends Application {
	int a=0;
	int t1,t2,t3,t4,t5,t6,t7,t8,t9,o,x=0;
	
	
	public void check() {
        //checks x wins conditions	

		if(
				(t1==10) && //button at top left corner of 1st row
				(t2==10) &&//1sr row
				(t3==10) //1st row
				) {
			o=123;
		}
			
		if(	
				(t4==10) && //button at top left corner of 2nd row
				(t5==10) &&//2nd row
				(t6==10) //2nd row
				) {
			o=456;
		}
			
		
		if(
				(t7==10) && //button at top left corner of 3rd row
				(t8==10) &&//3rd row
				(t9==10) //3rd row
				) {
			o=789;
		}
		if(

				(t1==10) && 
				(t4==10) &&
				(t7==10) 
				) {
				 
			o=147;//if first column has all matching axis 
		}
		if(

				(t2==10) && 
				(t5==10) &&
				(t8==10) 
				) {
			o=258;//if second column has all matching axis 
		}
		if(
				(t3==10) && 
				(t6==10) &&
				(t9==10) 
				) {
			o=369;//if third column has all matching axis 
		}
		if(
				(t1==10) && 
				(t5==10) &&
				(t9==10) 
				) {
			o=159;//if diagonal has all matching axis 
		}
		if(
				(t3==10) && 
				(t5==10) &&
				(t7==10) 
				) {
			o=357;//if diagonal has all matching axis 
		}


     //checks o wins conditions
		if(
				(t1==20) && //button at top left corner of 1st row
				(t2==20) &&//1sr row
				(t3==20) //1st row
				) {
		x=123;	;//if first row has all matching axis 
		}
		if(
				(t4==20) && //button at top left corner of 1st row
				(t5==20) &&//1sr row
				(t6==20) //1st row
				){
			x=456;//if second row has all matching axis 
		}
		if(
				(t7==20) && //button at top left corner of 1st row
				(t8==20) &&//1sr row
				(t9==20) //1st row
				) {  
			x=789;//if third row has all matching axis 
		}
		if(
				(t1==20) && //button at top left corner of 1st row
				(t4==20) &&//1sr row
				(t7==20) //1st row
				) {
				   
			x=147;//if first column has all matching axis 
		}
if(

		(t2==20) && //button at top left corner of 1st row
		(t5==20) &&//1sr row
		(t8==20) //1st row
		) {
		  		 
	x=258;//if second column has all matching axis 
}
if(
	(t3==20) && //button at top left corner of 1st row
	(t6==20) &&//1sr row
	(t9==20) //1st row
) {

	x=369;//if third column has all matching axis 
}
if(
	(t1==20) && //button at top left corner of 1st row
	(t5==20) &&//1sr row
	(t9==20) //1st row
				) {
	x=159;//if //diagonal has all matching axis 
}
if(
	(t3==20) && //button at top left corner of 1st row
	(t5==20) &&//1sr row
	(t7==20) //1st row
) {

	x=357;//if //diagonal has all matching axis 
}
else
{
if(
		((t1==10) ||
	(t1==20))&&

		((t2==10) ||
	(t2==20))&&

		((t3==10) ||
	(t3==20))&&

		((t4==10) ||
	(t4==20))&&

		((t5==10) ||
	(t5==20))&&

		((t6==10) ||
	(t6==20))&&

		((t7==10) ||
	(t7==20))&&

		((t8==10) ||
	(t8==20))&&

		((t9==10) ||
	(t9==20))
		)

	{
	
	o=100;
	}
}
	
}
	
	 @Override
	    public void start(Stage primaryStage){
	        primaryStage.setTitle("TicTacToe");
	        
	       Platform.setImplicitExit(false);

	        
	        Rectangle R=new Rectangle(); //instantiating Rectangle
			 R.setX(0); //setting the X coordinate of upper left corner of rectangle
			 R.setY(0); //setting the Y coordinate of upper left corner of rectangle
			 R.setWidth(500); //setting the width of rectangle
			 R.setHeight(120);
			 R.setFill(Color.rgb(0,0,0));
		     R.setStroke(Color.rgb(100, 100, 100));
		     R.setStrokeWidth(3);
		     
		     Label L=new Label();
		     Font f = Font.font("Ink Free", 75);
		     L.setPadding(new Insets(0,500,120,80));
		     L.setAlignment(Pos.CENTER);
		     L.setFont(f);
		     L.setTextFill(Color.rgb(0,255,0));
		     L.setText("Tic-Tac-Toe");

	        Button b1 = new Button();
	        Button b2 = new Button();
	        Button b3 = new Button();
	        Button b4 = new Button();
	        Button b5 = new Button();
	        Button b6 = new Button();
	        Button b7 = new Button();
	        Button b8 = new Button();
	        Button b9 = new Button();
	        Button br = new Button("Restart");
	        
	        String bstyle=String.format("-fx-background-color:#e0fbfc;-fx-border-color: grey; -fx-border-width: 2; -fx-pref-height: "
	        		+ "160px;-fx-pref-width: 167px;-fx-font-family: \"MV Boli\";  -fx-font-size:75");
	        
	        String Cstyle=String.format("-fx-background-color:#00ff00;-fx-border-color: grey; -fx-border-width: 2; -fx-pref-height: "
	        		+ "160px;-fx-pref-width: 167px; -fx-font-family: \"MV Boli\";  -fx-font-size:75");
	        
	        String Rstyle=String.format("-fx-background-color:#00FF00;  -fx-border-color: black; -fx-border-width: 2; -fx-pref-height: "
	        		+ "30px;-fx-pref-width: 500px; -fx-font-family: \"Ink Free\";  -fx-font-size:24");
	        
	        b1.setStyle(bstyle);
	        b2.setStyle(bstyle);
	        b3.setStyle(bstyle);
	        b4.setStyle(bstyle);
	        b5.setStyle(bstyle);
	        b6.setStyle(bstyle);
	        b7.setStyle(bstyle);
	        b8.setStyle(bstyle);
	        b9.setStyle(bstyle);
	        br.setStyle(Rstyle);
	        br.setTextFill(Color.BLACK);
	        
	        
	        HBox h=new HBox(br);
	        HBox h1=new HBox(b1,b2,b3);
	        h1.setSpacing(0);
	        HBox h2=new HBox(b4,b5,b6);
	        h2.setSpacing(0);
	        HBox h3=new HBox(b7,b8,b9);
	        h3.setSpacing(0);
	        VBox V=new VBox(h1,h2,h3);
	        V.setSpacing(0);
	        V.setPadding(new Insets(0,0,0,0));
	        VBox V1=new VBox(h,V);
	        V1.setPadding(new Insets(120,0,0,0));
	        
	        
	        Group g=new Group(R,L,V1);
	        
	        Scene scene = new Scene(g, 500, 700);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	        br.setOnAction(e->
	        {
	        	
	        	
	        	b1.setStyle(bstyle);
	 	        b2.setStyle(bstyle);
	 	        b3.setStyle(bstyle);
	 	        b4.setStyle(bstyle);
	 	        b5.setStyle(bstyle);
	 	        b6.setStyle(bstyle);
	 	        b7.setStyle(bstyle);
	 	        b8.setStyle(bstyle);
	 	        b9.setStyle(bstyle);
	 	        
	 	       a=0;
	 	  	t1=t2=t3=t4=t5=t6=t7=t8=t9=o=x=0;
	 	  	L.setText("Tic Tac Toe");
	 	  	
	 	  	V.setDisable(false);
	 	  	
	 	  	b1.setText("");
	 	  	b2.setText("");
	 	  	b3.setText("");
	 	  	b4.setText("");
	 	  	b5.setText("");
	 	  	b6.setText("");
	 	  	b7.setText("");
	 	  	b8.setText("");
	 	  	b9.setText("");
	      
	        });       
	    
	        
	        b1.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b1.setTextFill(Color.BLUE);
	        		b1.setText("O");
	        		L.setText("X Turn");
	        		t1=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b1.setText("X");
	        		b1.setTextFill(Color.RED);
	        		L.setText("O Turn");
	        		t1=20;
	        	}
	        	
	        	check();
	        	
	        	if(o==123||x==123)
	        	{
	        	b1.setStyle(Cstyle);
	        	b2.setStyle(Cstyle);
	        	b3.setStyle(Cstyle);
	         
	         	
	         	V.setDisable(true);
	         	
	        	
	        	}
	        	if(o==147||x==147)
	        	{
	        		b1.setStyle(Cstyle);
		        	b2.setStyle(Cstyle);
		        	b3.setStyle(Cstyle);
		         	V.setDisable(true);
		       
	        	}
	        	if(o==159||x==159)
	        	{

	        		b1.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		         	
	        	}
	        	
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        		
	        		L.setText("DRAW!");
	        	}
	        		
	        
	        	if(o==123||o==147||o==159)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==123||x==147||x==159)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b2.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b2.setTextFill(Color.BLUE);
	        		b2.setText("O");
	        		L.setText("X Turn");
	        		t2=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b2.setTextFill(Color.RED);
	        		b2.setText("X");
	        		L.setText("O Turn");
	        		t2=20;
	        	}
check();
	        	
	        	if(o==123||x==123)
	        	{
	        		b1.setStyle(Cstyle);
		        	b2.setStyle(Cstyle);
		        	b3.setStyle(Cstyle);
	         	V.setDisable(true);
	        
	        	
	        	}
	        	if(o==258||x==258)
	        	{

	        		b2.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		         	V.setDisable(true);
		      
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        		
	        		L.setText("DRAW!");
	        	}
	        		
	        		
	        
	        	if(o==123||o==158)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==123||x==158)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b3.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b3.setTextFill(Color.BLUE);
	        		b3.setText("O");
	        
	        		L.setText("X Turn");
	        		t3=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b3.setTextFill(Color.RED);
	        		b3.setText("X");
	        		L.setText("O Turn");
	        		t3=20;
	        	}
check();
	        	
	        	if(o==123||x==123)
	        	{
	        		b1.setStyle(Cstyle);
		        	b2.setStyle(Cstyle);
		        	b3.setStyle(Cstyle);
	         	V.setDisable(true);
	         	
	        	
	        	}
	        	if(o==357||x==357)
	        	{
	        		b3.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b7.setStyle(Cstyle);
		         	V.setDisable(true);
		         	
	        	}
	        	if(o==369||x==369)
	        	{
	        		b3.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		      
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        
	        		L.setText("DRAW!");
	        	}
	        		
	        		
	        
	        	if(o==123||o==357||o==369)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==123||x==357||x==369)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b4.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b4.setTextFill(Color.BLUE);
	        		b4.setText("O");
	        		L.setText("X Turn");
	        		t4=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b4.setText("X");
	        		b4.setTextFill(Color.RED);
	        		L.setText("O Turn");
	        		t4=20;
	        	}
check();
	        	
	        	if(o==456||x==456)
	        	{
	        		b4.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
	         	V.setDisable(true);
	         
	        	
	        	}
	        	if(o==147||x==147)
	        	{

	        		b1.setStyle(Cstyle);
		        	b4.setStyle(Cstyle);
		        	b7.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        		
	        		L.setText("DRAW!");
	        	}
	        		
	        
	        	if(o==456||o==147)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==456||x==147)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b5.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b5.setTextFill(Color.BLUE);
	        		b5.setText("O");
	        		
	        		L.setText("X Turn");
	        		t5=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b5.setTextFill(Color.RED);
	        		b5.setText("X");
	        	
	        		L.setText("O Turn");
	        		t5=20;
	        	}
check();
	        	
	        	if(o==456||x==456)
	        	{
	        		b4.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
	         	V.setDisable(true);
	         
	        	
	        	}
	        	if(o==258||x==258)
	        	{

	        		b2.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        	if(o==159||x==159)
	        	{

	        		b1.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        		
	        	if(o==357||x==357)
	        	{
	        		b3.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b7.setStyle(Cstyle);
		         	V.setDisable(true);
		   
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        	
	        		L.setText("DRAW!");
	        	}
	        		
	        		
	        	if(o==456||o==258||o==159||o==357)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==456||x==258||x==159||x==357)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b6.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b6.setTextFill(Color.BLUE);
	        		b6.setText("O");
	        	
	        		L.setText("X Turn");
	        		t6=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b6.setTextFill(Color.RED);
	        		b6.setText("X");
	        		L.setText("O Turn");
	        		t6=20;
	        	}
check();
	        	
	        	if(o==456||x==456)
	        	{
	        		b4.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
	         	V.setDisable(true);
	       
	        	
	        	}
	        	if(o==369||x==369)
	        	{
	        		b3.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        
	        		L.setText("DRAW!");
	        	}
	        		
	        
	        	if(o==456||o==369)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==456||x==369)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b7.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b7.setTextFill(Color.BLUE);
	        		b7.setText("O");
	        	
	        		L.setText("X Turn");
	        		t7=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b7.setTextFill(Color.RED);
	        		b7.setText("X");
	        		L.setText("O Turn");
	        		t7=20;
	        	}
check();
	        	
	        	if(o==789||x==789)
	        	{
	        		b7.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
	         	V.setDisable(true);
	        
	        	
	        	}
	        	if(o==147||x==147)
	        	{
	        		b1.setStyle(Cstyle);
		        	b4.setStyle(Cstyle);
		        	b7.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        	if(o==357||x==357)
	        	{

	        		b3.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b7.setStyle(Cstyle);
		         	V.setDisable(true);
		         	
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        	
	        		L.setText("DRAW!");
	        	}
	        		
	        		
	        
	        	if(o==789||o==147||o==357)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==789||x==147||x==357)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        b8.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b8.setTextFill(Color.BLUE);
	        		b8.setText("O");
	        	
	        		L.setText("X Turn");
	        		t8=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b8.setTextFill(Color.RED);
	        		b8.setText("X");
	        		L.setText("O Turn");
	        		t8=20;
	        	}
check();
	        	
	        	if(o==789||x==789)
	        	{
	        		b7.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
	         	V.setDisable(true);
	       
	        	
	        	}
	        	if(o==258||x==258)
	        	{
	        		b2.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		         	V.setDisable(true);
		         
	        	}
	        		
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        	
	        		L.setText("DRAW!");
	        	}
	        		
	        	if(o==789||o==258)
	        	{
	        		L.setText("O Won!");
	        	}
	        	if(x==789||x==258)
	        	{
	        		L.setText("X Won!");
	        	}
	        	
	        });
	        
	        
	        b9.setOnAction(e->
	        {
	        	if(a==0)
	        	{
	        		a=1;
	        		b9.setTextFill(Color.BLUE);
	        		b9.setText("O");
	        		L.setText("   X Turn");
	        		t9=10;
	        		
	        	}
	        	else {
	        		a=0;
	        		b9.setTextFill(Color.RED);
	        		b9.setText("X");
	        		L.setText("   O Turn");
	        		t9=20;
	        	}
check();
	        	
	        	if(o==159||x==159)
	        	{
	        		b1.setStyle(Cstyle);
		        	b5.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		        	V.setDisable(true);
		        
	        	
	        	}
	        	if(o==369||x==369)
	        	{
	        		b3.setStyle(Cstyle);
		        	b6.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		     
	        	}
	        	if(o==789||x==789)
	        	{

	        		b7.setStyle(Cstyle);
		        	b8.setStyle(Cstyle);
		        	b9.setStyle(Cstyle);
		         	V.setDisable(true);
		   
	        	}
	        	if(o==100)
	        	{
	        		V.setDisable(true);
	        		
	        		L.setText("   DRAW!");
	        	}
	        		
	        		
	        
	        	if(o==369||o==789||o==159)
	        	{
	        		L.setText("   O Won!");
	        	}
	        	if(x==369||x==789||x==159)
	        	{
	        		L.setText("   X Won!");
	        	}
	        	
	        });
	        
	    }
	 

	                 public static void main(String[] args) {
	                       Application.launch(args);
	                         }

                                     }