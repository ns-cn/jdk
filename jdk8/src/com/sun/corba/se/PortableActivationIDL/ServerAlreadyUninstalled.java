package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyUninstalled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macosx/zulu-src.git/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, April 18, 2022 8:56:48 AM PDT
*/

public final class ServerAlreadyUninstalled extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyUninstalled ()
  {
    super(ServerAlreadyUninstalledHelper.id());
  } // ctor

  public ServerAlreadyUninstalled (String _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyUninstalled (String $reason, String _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyUninstalled
