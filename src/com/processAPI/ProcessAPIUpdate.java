package com.processAPI;

public class ProcessAPIUpdate {

    public static void main(String[] args)
    {
        ProcessHandle ph = ProcessHandle.current();
        ProcessHandle.Info pinfo = ph.info();

        System.out.println("Complete process information is :" + pinfo);
        System.out.println("User of the process is : " + pinfo.user());
        System.out.println("Command used is : " + pinfo.command());
        System.out.println("Time of process starting is : " + pinfo.startInstant());
        System.out.println("Total CPU Duration is : " + pinfo.totalCpuDuration());
    }
}
