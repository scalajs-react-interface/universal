package sri.universal

import scala.scalajs.js

trait FunctionToUndefOrJSFunctionImplicits {
  implicit def FtoJSF0[R](
      in: scala.Function0[R]): js.UndefOr[js.Function0[R]] = {
    js.defined(in: js.Function0[R])
  }

  implicit def FtoJSF1[P1, R](
      in: scala.Function1[P1, R]): js.UndefOr[js.Function1[P1, R]] = {
    js.defined(in: js.Function1[P1, R])
  }

  implicit def FtoJSF2[P1, P2, R](
      in: scala.Function2[P1, P2, R]): js.UndefOr[js.Function2[P1, P2, R]] = {
    js.defined(in: js.Function2[P1, P2, R])
  }

  implicit def FtoJSF3[P1, P2, P3, R](in: scala.Function3[P1, P2, P3, R])
    : js.UndefOr[js.Function3[P1, P2, P3, R]] = {
    js.defined(in: js.Function3[P1, P2, P3, R])
  }

  implicit def FtoJSF4[P1, P2, P3, P4, R](
      in: scala.Function4[P1, P2, P3, P4, R])
    : js.UndefOr[js.Function4[P1, P2, P3, P4, R]] = {
    js.defined(in: js.Function4[P1, P2, P3, P4, R])
  }

  implicit def FtoJSF5[P1, P2, P3, P4, P5, R](
      in: scala.Function5[P1, P2, P3, P4, P5, R])
    : js.UndefOr[js.Function5[P1, P2, P3, P4, P5, R]] = {
    js.defined(in: js.Function5[P1, P2, P3, P4, P5, R])
  }

  implicit def FtoJSF6[P1, P2, P3, P4, P5, P6, R](
      in: scala.Function6[P1, P2, P3, P4, P5, P6, R])
    : js.UndefOr[js.Function6[P1, P2, P3, P4, P5, P6, R]] = {
    js.defined(in: js.Function6[P1, P2, P3, P4, P5, P6, R])
  }

  implicit def FtoJSF7[P1, P2, P3, P4, P5, P6, P7, R](
      in: scala.Function7[P1, P2, P3, P4, P5, P6, P7, R])
    : js.UndefOr[js.Function7[P1, P2, P3, P4, P5, P6, P7, R]] = {
    js.defined(in: js.Function7[P1, P2, P3, P4, P5, P6, P7, R])
  }

  implicit def FtoJSF8[P1, P2, P3, P4, P5, P6, P7, P8, R](
      in: scala.Function8[P1, P2, P3, P4, P5, P6, P7, P8, R])
    : js.UndefOr[js.Function8[P1, P2, P3, P4, P5, P6, P7, P8, R]] = {
    js.defined(in: js.Function8[P1, P2, P3, P4, P5, P6, P7, P8, R])
  }
}

object FunctionToUndefOrJSFunctionImplicits
    extends FunctionToUndefOrJSFunctionImplicits {}
