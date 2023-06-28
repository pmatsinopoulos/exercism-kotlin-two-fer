fun twofer(name: String? = null) = when (name) {
    null -> "One for you, one for me."
    else -> "One for $name, one for me."
}
