package org.omg.IOP;


/**
* org/omg/IOP/TaggedProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/hduser/openjdk-8-for-build/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, February 13, 2020 6:09:47 PM KST
*/

public final class TaggedProfile implements org.omg.CORBA.portable.IDLEntity
{

  /** The tag, represented as a profile id. */
  public int tag = (int)0;

  /** The associated profile data. */
  public byte profile_data[] = null;

  public TaggedProfile ()
  {
  } // ctor

  public TaggedProfile (int _tag, byte[] _profile_data)
  {
    tag = _tag;
    profile_data = _profile_data;
  } // ctor

} // class TaggedProfile