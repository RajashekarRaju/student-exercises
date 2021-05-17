/**
 * A class which extends Students properties.
 */
class College : Students {

    override fun name() {
        super.name()
    }

    override fun rollNumber() {
        super.rollNumber()
    }
}

interface Students {

    // A empty function 'name' which returns nothing
    fun name() {

    }

    // A empty function 'rollNumber' which returns nothing
    fun rollNumber() {

    }
}