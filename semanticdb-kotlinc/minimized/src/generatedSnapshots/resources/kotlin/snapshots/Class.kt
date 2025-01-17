package snapshots
//      ^^^^^^^^^ reference snapshots/

class Class constructor(private var banana: Int, apple: String): Throwable(banana.toString()) {
//    ^^^^^ definition snapshots/Class# Class
//          ^^^^^^^^^^^ definition snapshots/Class#`<init>`(). Class
//                                  ^^^^^^ definition snapshots/Class#banana. banana
//                                  ^^^^^^ definition snapshots/Class#getBanana(). banana
//                                  ^^^^^^ definition snapshots/Class#setBanana(). banana
//                                  ^^^^^^ definition snapshots/Class#`<init>`().(banana) banana
//                                          ^^^ reference kotlin/Int#
//                                               ^^^^^ definition snapshots/Class#`<init>`().(apple) apple
//                                                      ^^^^^^ reference kotlin/String#
//                                                               ^^^^^^^^^ reference kotlin/Throwable#`<init>`().
//                                                                         ^^^^^^ reference snapshots/Class#`<init>`().(banana)
//                                                                                ^^^^^^^^ reference kotlin/Int#toString().
    init {
        println("")
//      ^^^^^^^ reference kotlin/io/ConsoleKt#println(+1).
    }

    val asdf = object {
//      ^^^^ definition snapshots/Class#asdf. asdf
//      ^^^^ definition snapshots/Class#getAsdf(). asdf
        fun doStuff() = Unit
//          ^^^^^^^ definition local0 doStuff
//                      ^^^^ reference kotlin/Unit#
    }

    constructor(): this(1, "")
//  ^^^^^^^^^^^ definition snapshots/Class#`<init>`(+1). Class

    constructor(banana: Int): this(banana, "")
//  ^^^^^^^^^^^ definition snapshots/Class#`<init>`(+2). Class
//              ^^^^^^ definition snapshots/Class#`<init>`(+2).(banana) banana
//                      ^^^ reference kotlin/Int#
//                                 ^^^^^^ reference snapshots/Class#`<init>`(+2).(banana)

    fun run() {
//      ^^^ definition snapshots/Class#run(). run
        println(Class::class)
//      ^^^^^^^ reference kotlin/io/ConsoleKt#println(+1).
//              ^^^^^ reference snapshots/Class#
        println("I eat $banana for lunch")
//      ^^^^^^^ reference kotlin/io/ConsoleKt#println(+1).
//                      ^^^^^^ reference snapshots/Class#banana.
//                      ^^^^^^ reference snapshots/Class#getBanana().
//                      ^^^^^^ reference snapshots/Class#setBanana().
    }
}