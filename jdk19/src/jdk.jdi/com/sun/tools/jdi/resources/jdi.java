package com.sun.tools.jdi.resources;

import java.util.ListResourceBundle;

public final class jdi extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "false", "false" },
            { "generic_attaching.address", "Address to which to attach for VM connections" },
            { "generic_attaching.address.label", "Address" },
            { "generic_attaching.timeout", "Timeout while waiting to attach" },
            { "generic_attaching.timeout.label", "Timeout" },
            { "generic_listening.address", "Address to listen for VM connections" },
            { "generic_listening.address.label", "Address" },
            { "generic_listening.timeout", "Timeout while waiting for connection" },
            { "generic_listening.timeout.label", "Timeout" },
            { "memory_attaching.description", "Attaches by shared memory to other VMs" },
            { "memory_attaching.name", "Name of the shared memory area to which to attach for VM connections" },
            { "memory_attaching.name.label", "Name" },
            { "memory_listening.description", "Accepts shared memory connections initiated by other VMs" },
            { "memory_listening.name", "Name of the shared memory area at which to listen for VM connection" },
            { "memory_listening.name.label", "Name" },
            { "memory_transportservice.description", "Connects debugger and debuggee using a shared memory connection" },
            { "process_attaching.description", "Attaches to debuggee by process-id (pid)" },
            { "process_attaching.pid", "pid" },
            { "process_attaching.pid.label", "Process-id (pid) of debuggee" },
            { "raw.address", "Address from which to listen for a connection after the raw command is run" },
            { "raw.address.label", "Address" },
            { "raw.command", "Raw command to start the debugged application VM" },
            { "raw.command.label", "Command" },
            { "raw.description", "Launches target using user-specified command line and attaches to it" },
            { "raw.quote", "Character used to combine space-delimited text into a single command line argument" },
            { "raw.quote.label", "Quote" },
            { "socket_attaching.description", "Attaches by socket to other VMs" },
            { "socket_attaching.host", "Machine name to which to attach for VM connections" },
            { "socket_attaching.host.label", "Host" },
            { "socket_attaching.port", "Port number to which to attach for VM connections" },
            { "socket_attaching.port.label", "Port" },
            { "socket_listening.description", "Accepts socket connections initiated by other VMs" },
            { "socket_listening.localaddr", "Local address that the listener binds to" },
            { "socket_listening.localaddr.label", "Local address" },
            { "socket_listening.port", "Port number at which to listen for VM connections" },
            { "socket_listening.port.label", "Port" },
            { "socket_transportservice.description", "Connects debugger and debuggee using a TCP connection" },
            { "sun.description", "Launches target using Sun Java VM command line and attaches to it" },
            { "sun.home", "Home directory of the SDK or runtime environment used to launch the application" },
            { "sun.home.label", "Home" },
            { "sun.include_virtualthreads", "List of all threads includes virtual threads as well as platform threads. Virtual threads are a preview feature of the Java platform." },
            { "sun.include_virtualthreads.label", "Include Virtual Threads" },
            { "sun.init_suspend", "All threads will be suspended before execution of main" },
            { "sun.init_suspend.label", "Suspend" },
            { "sun.main", "Main class and arguments, or if -jar is an option, the main jar file and arguments" },
            { "sun.main.label", "Main" },
            { "sun.options", "Launched VM options" },
            { "sun.options.label", "Options" },
            { "sun.quote", "Character used to combine space-delimited text into a single command line argument" },
            { "sun.quote.label", "Quote" },
            { "sun.vm_exec", "Name of the Java VM launcher" },
            { "sun.vm_exec.label", "Launcher" },
            { "true", "true" },
            { "version_format", "Java Debug Interface (Reference Implementation) version {0}.{1} \n{2}" },
        };
    }
}
