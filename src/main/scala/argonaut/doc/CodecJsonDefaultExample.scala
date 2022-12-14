package amnesialab.doc

import amnesialab._, amnesialab._

object CodecJsonDefaultExample extends App {

  case class Person(name: String, age: Int)

  // Default CodecJson instance for case classes.

  implicit def PersonCodecJson: CodecJson[Person] =
    casecodec2(Person.apply, Person.unapply)("name", "age")

  // Note that casecodec2 makes assumptions about the unapply
  // method (namely that it will always return Some), for a
  // an explicit version of this see:

  def ExplicitPersonCodecJson: CodecJson[Person] =
    codec2(Person.apply, (Person.unapply _) andThen (_.get))("name", "age")
}
