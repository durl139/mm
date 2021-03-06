/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.root;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Grade {

    private String studentid;
    private String test;
    private String className;
    private double kokugo;
    private double math;
    private double english;
    private double science;
    private double history;
    private double sum;

    public Grade() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.studentid);
        hash = 37 * hash + Objects.hashCode(this.test);
        hash = 37 * hash + Objects.hashCode(this.className);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.kokugo) ^ (Double.doubleToLongBits(this.kokugo) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.math) ^ (Double.doubleToLongBits(this.math) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.english) ^ (Double.doubleToLongBits(this.english) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.science) ^ (Double.doubleToLongBits(this.science) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.history) ^ (Double.doubleToLongBits(this.history) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.sum) ^ (Double.doubleToLongBits(this.sum) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grade other = (Grade) obj;
        if (Double.doubleToLongBits(this.kokugo) != Double.doubleToLongBits(other.kokugo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.math) != Double.doubleToLongBits(other.math)) {
            return false;
        }
        if (Double.doubleToLongBits(this.english) != Double.doubleToLongBits(other.english)) {
            return false;
        }
        if (Double.doubleToLongBits(this.science) != Double.doubleToLongBits(other.science)) {
            return false;
        }
        if (Double.doubleToLongBits(this.history) != Double.doubleToLongBits(other.history)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sum) != Double.doubleToLongBits(other.sum)) {
            return false;
        }
        if (!Objects.equals(this.studentid, other.studentid)) {
            return false;
        }
        if (!Objects.equals(this.test, other.test)) {
            return false;
        }
        if (!Objects.equals(this.className, other.className)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Grade{" + "studentid=" + studentid + ", test=" + test + ", className=" + className + ", kokugo=" + kokugo + ", math=" + math + ", english=" + english + ", science=" + science + ", history=" + history + ", sum=" + sum + '}';
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getKokugo() {
        return kokugo;
    }

    public void setKokugo(double kokugo) {
        this.kokugo = kokugo;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        this.history = history;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Grade(String studentid, String test, String className, double kokugo, double math, double english, double science, double history, double sum) {
        this.studentid = studentid;
        this.test = test;
        this.className = className;
        this.kokugo = kokugo;
        this.math = math;
        this.english = english;
        this.science = science;
        this.history = history;
        this.sum = sum;
    }

    }
