package com.example.scientificcalculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsin,blog,bln,bcos,bAC,bC,btan,bfact,bsqrt,bsquare,bpi,ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8,ob9;
    TextView tv1,tv2;
    String pi="3.14159265359";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.bone);
        b2=findViewById(R.id.btwo);
        b3=findViewById(R.id.bthree);
        b4=findViewById(R.id.bfour);
        b5=findViewById(R.id.bfive);
        b6=findViewById(R.id.bsix);
        b7=findViewById(R.id.bseven);
        b8=findViewById(R.id.beight);
        b9=findViewById(R.id.bnine);
        b0=findViewById(R.id.bzero);
        ob1=findViewById(R.id.ob1);
        ob2=findViewById(R.id.ob2);
        ob3=findViewById(R.id.ob3);
        ob4=findViewById(R.id.ob4);
        ob5=findViewById(R.id.ob5);
        ob6=findViewById(R.id.ob6);
        ob7=findViewById(R.id.ob7);
        ob8=findViewById(R.id.ob8);
        ob9=findViewById(R.id.ob9);
        bsin=findViewById(R.id.bsin);
        blog=findViewById(R.id.blog);
        bln=findViewById(R.id.bln);
        bcos=findViewById(R.id.bcos);
        bAC=findViewById(R.id.bAC);
        bC=findViewById(R.id.bC);
        btan=findViewById(R.id.btan);
        bfact=findViewById(R.id.bfact);
        bsqrt=findViewById(R.id.bsqrt);
        bsquare=findViewById(R.id.bsquare);
        bpi=findViewById(R.id.bpi);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"0");
            }
        });
        ob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"(");
            }
        });
        ob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+")");
            }
        });
        ob3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"^"+"(-1)");
            }
        });
        ob4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"+");
            }
        });
        ob5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"x");
            }
        });
        ob6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"-");
            }
        });
        ob7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"÷");
            }
        });
        ob8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+".");
            }
        });
        ob9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tv1.getText().toString();
                String replacedstr=val
                        .replace('÷','/')
                        .replace('x','*');
                double result=eval(replacedstr);
                tv2.setText(String.valueOf(result));
                tv1.setText(val);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"sin");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"log");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"bln");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"cos");
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(" ");
                tv2.setText(" ");
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tv1.getText().toString();
                val=val.substring(0,val.length()-1);
                tv1.setText(val);
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"tan");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(tv1.getText().toString());
                int fact=factorial(val);
                tv1.setText(String.valueOf(fact));
                tv2.setText(val+"!");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tv1.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tv1.setText(String.valueOf(r));
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(tv1.getText().toString());
                double square=d*d;
                tv1.setText(String.valueOf(square));
                tv2.setText(d+" ²");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText(bpi.getText());
                tv1.setText(tv1.getText()+pi);
            }
        });

    }

    private double eval(String str) {
        return new Object(){
            int pos=-1,ch;

            void nextChar(){
                ch=(++pos<str.length())?str.charAt(pos):-1;
            }

            boolean eat(int charToEat){
                while(ch==' ') nextChar();
                if(ch==charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse(){
                nextChar();
                double x=parseExpression();
                if(pos<str.length()) throw new RuntimeException("Unexpected:"+(char)ch);
                return x;
            }

            double parseExpression(){
                double x=parseTerm();
                for(; ; ){
                    if(eat('+')) x +=parseTerm();
                    else if(eat('-')) x -=parseTerm();
                    else return x;
                }
            }

            double parseTerm(){
                double x = parseFactor();
                for(; ; ){
                    if(eat('*')) x *=parseFactor();
                    else if(eat('/')) x /=parseFactor();
                    else return x;
                }
            }
            double parseFactor(){
                if(eat('+')) return parseFactor();
                if(eat('-')) return parseFactor();

                double x;
                int startPos=this.pos;
                if(eat('(')) {
                    x = parseExpression();
                    eat(')');
                }
                else if((ch>'0' && ch<'9') || ch=='.') {
                    while ((ch > '0' && ch < '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if(ch>'a' && ch<'z') {
                    while (ch > 'a' && ch < 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown Function" + func);
                }else {
                    throw new RuntimeException("Unexcepted:" + (char) ch);
                }
                if(eat('^'))x=Math.pow(x,parseFactor());
                return x;

                }
            }.parse();
        }

    private int factorial(int n){
        return(n==1 || n==0)? 1:n*factorial(n-1);
    }

}