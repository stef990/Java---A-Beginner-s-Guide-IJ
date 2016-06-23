package com.javabeginner.Chapter5;

/**
 * Created by Stefano Garombo on 22/06/2016.
 */
class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }


    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Queue full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("Empty queue");
            return (char) 0;
        }
        return q[getloc++];
    }
}
public class Queuedemo{
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using biqQ to store the alphabet.");
        for(i=0; i<26; i++)
            bigQ.put((char) ('A' +i));

        System.out.println("Contents of bigQ: ");
        for(i=0; i<26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

    }
}

