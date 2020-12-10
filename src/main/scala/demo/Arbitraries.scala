package demo

import org.scalacheck.Arbitrary
import org.scalacheck.Gen

import magnolify.scalacheck.semiauto.ArbitraryDerivation.apply

import shapeless.Witness

object Arbitraries {
  case class NonEmptyMap[K, V](head: (K, V), tail: Map[K, V])

  implicit def arbitraryNonEmptyMap[K: Arbitrary, V: Arbitrary]: Arbitrary[NonEmptyMap[K, V]] = {
    type T = ((K, V), Map[K, V]) => NonEmptyMap[K, V]

    Arbitrary(
      Gen.resultOf(??? : T)
    )
  }

  implicit def arbitrarySingleton[X: Witness.Aux]: Arbitrary[X] = ???
}
