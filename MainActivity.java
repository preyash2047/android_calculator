package com.preyash2047.android_calculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button n0, n00, n1,n2,n3,n4,n5, n6,n7,n8,n9,nd,add,sub,mul,div, eql,per,clr, clrall;
    TextView tv0,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //id called here
        n0 = findViewById(R.id.n0);
        n00 = findViewById(R.id.n00);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        nd = findViewById(R.id.nd);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        eql = findViewById(R.id.eql);
        per = findViewById(R.id.per);
        clr = findViewById(R.id.clr);
        clrall = findViewById(R.id.clrall);
        tv0 = findViewById(R.id.tv0);
        tv1 = findViewById(R.id.tv1);

        final String[] screen1 = {""};
        final String[] screen2 = {""};
        final String[] screen3 = {""};
        final String error = "Enter Value";
        final double[] a = {0};

        //numeric buttons
        n1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "1";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "1";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "2";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "2";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "3";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "3";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "4";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "4";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "5";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "5";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "6";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "6";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "7";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "7";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "9";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "9";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "8";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "8";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "0";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "0";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a[0] == 0) {
                    screen1[0] = screen1[0] + "00";
                    tv0.setText(screen1[0]);
                    tv1.setText(screen1[0]);
                } else {
                    screen3[0] = screen3[0] + "00";
                    tv0.setText(screen1[0] + screen3[0]);
                    tv1.setText(screen3[0]);
                }
            }
        });
        nd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains(".") || screen3[0].contains(".")) {
                    Toast.makeText(MainActivity.this, "Only One dot is allowed", Toast.LENGTH_SHORT).show();
                } else {
                    if (a[0] == 0) {
                        screen1[0] = screen1[0] + ".";
                        tv0.setText(screen1[0]);
                        tv1.setText(screen1[0]);
                    } else {
                        screen3[0] = screen3[0] + ".";
                        tv0.setText(screen1[0] + screen3[0]);
                        tv1.setText(screen3[0]);
                    }
                }
            }
        });

        //Operations button
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains("-") || screen1[0].contains("*") || screen1[0].contains("/")) {
                    Toast.makeText(MainActivity.this, "Select only one operator at a time", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        a[0] = Double.parseDouble(screen1[0]);
                        screen2[0] = screen1[0];
                        screen1[0] = screen1[0] + " + ";
                        tv0.setText(screen1[0]);
                        tv1.setText(screen2[0]);
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains("+") || screen1[0].contains("*") || screen1[0].contains("/")) {
                    Toast.makeText(MainActivity.this, "Select only one operator at a time", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        a[0] = Double.parseDouble(screen1[0]);
                        screen2[0] = screen1[0];
                        screen1[0] = screen1[0] + " - ";
                        tv0.setText(screen1[0]);
                        tv1.setText(screen2[0]);
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains("-") || screen1[0].contains("+") || screen1[0].contains("/")) {
                    Toast.makeText(MainActivity.this, "Select only one operator at a time", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        a[0] = Double.parseDouble(screen1[0]);
                        screen2[0] = screen1[0];
                        screen1[0] = screen1[0] + " * ";
                        tv0.setText(screen1[0]);
                        tv1.setText(screen2[0]);
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains("-") || screen1[0].contains("*") || screen1[0].contains("+")) {
                    Toast.makeText(MainActivity.this, "Select only one operator at a time", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        a[0] = Double.parseDouble(screen1[0]);
                        screen2[0] = screen1[0];
                        screen1[0] = screen1[0] + " / ";
                        tv0.setText(screen1[0]);
                        tv1.setText(screen2[0]);
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen1[0].contains("-") || screen1[0].contains("*") || screen1[0].contains("/")) {
                    Toast.makeText(MainActivity.this, "Select only one operator at a time", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        Double per = Double.parseDouble(screen1[0]) / 100;
                        screen1[0] = screen1[0] + "%";
                        tv0.setText(screen1[0]);
                        tv1.setText(per + "");
                        screen1[0] = per + "";
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (screen3[0] == "") {
                    Toast.makeText(MainActivity.this, "Enter all value", Toast.LENGTH_SHORT).show();
                    screen1[0] = screen1[0] = screen3[0] = "";
                    a[0] = 0;
                    tv0.setText(screen1[0] + "");
                    tv1.setText(screen3[0] + "");
                } else {
                    if (screen1[0] != "") {
                        double eql = 0.0;
                        if (screen1[0].contains("+")) {
                            eql = Double.valueOf(screen2[0]) + Double.valueOf(screen3[0]);
                        } else if (screen1[0].contains("-")) {
                            eql = Double.valueOf(screen2[0]) - Double.valueOf(screen3[0]);
                        } else if (screen1[0].contains("*")) {
                            eql = Double.valueOf(screen2[0]) * Double.valueOf(screen3[0]);
                        } else if (screen1[0].contains("/")) {
                            eql = Double.valueOf(screen2[0]) / Double.valueOf(screen3[0]);
                        } else {
                            tv0.setText("");
                            screen1[0] = screen2[0] = "";
                            screen3[0] = error;
                            eql = 0.0;
                        }
                        tv0.setText(screen1[0] + screen3[0]);
                        tv1.setText(eql + "");
                        screen1[0] = eql + "";
                        screen2[0] = screen3[0] = "";
                    } else {
                        tv0.setText("");
                        tv1.setText(error);
                    }
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen3[0] = "";
                tv0.setText(screen1[0] + screen3[0]);
                tv1.setText(screen3[0]);
            }
        });
        clrall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                screen1[0] = screen1[0] = screen3[0] = "";
                a[0] = 0;
                tv0.setText(screen1[0] + "");
                tv1.setText(screen3[0] + "");
            }
        });
    }
}
