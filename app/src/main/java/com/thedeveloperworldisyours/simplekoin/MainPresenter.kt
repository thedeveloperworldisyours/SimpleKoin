package com.thedeveloperworldisyours.simplekoin

class MainPresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"
}
