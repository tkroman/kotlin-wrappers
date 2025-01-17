// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface FilterFunction :
    Filter,
    BackdropFilter

inline fun blur(
    value: Number,
): FilterFunction =
    "blur($value)".unsafeCast<FilterFunction>()

inline fun blur(
    value: Length,
): FilterFunction =
    "blur($value)".unsafeCast<FilterFunction>()

inline fun brightness(
    value: Number,
): FilterFunction =
    "brightness($value)".unsafeCast<FilterFunction>()

inline fun brightness(
    value: Percent,
): FilterFunction =
    "brightness($value)".unsafeCast<FilterFunction>()

inline fun contrast(
    value: Number,
): FilterFunction =
    "contrast($value)".unsafeCast<FilterFunction>()

inline fun contrast(
    value: Percent,
): FilterFunction =
    "contrast($value)".unsafeCast<FilterFunction>()

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
): FilterFunction =
    "drop-shadow($offsetX $offsetY)".unsafeCast<FilterFunction>()

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
): FilterFunction =
    "drop-shadow($offsetX $offsetY $blurRadius)".unsafeCast<FilterFunction>()

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): FilterFunction =
    "drop-shadow($offsetX $offsetY $blurRadius $color)".unsafeCast<FilterFunction>()

inline fun grayscale(
    value: Number,
): FilterFunction =
    "grayscale($value)".unsafeCast<FilterFunction>()

inline fun grayscale(
    value: Percent,
): FilterFunction =
    "grayscale($value)".unsafeCast<FilterFunction>()

inline fun hueRotate(
    value: Number,
): FilterFunction =
    "hue-rotate($value)".unsafeCast<FilterFunction>()

inline fun hueRotate(
    value: Angle,
): FilterFunction =
    "hue-rotate($value)".unsafeCast<FilterFunction>()

inline fun invert(
    value: Number,
): FilterFunction =
    "invert($value)".unsafeCast<FilterFunction>()

inline fun invert(
    value: Percent,
): FilterFunction =
    "invert($value)".unsafeCast<FilterFunction>()

inline fun opacity(
    value: Number,
): FilterFunction =
    "opacity($value)".unsafeCast<FilterFunction>()

inline fun opacity(
    value: Percent,
): FilterFunction =
    "opacity($value)".unsafeCast<FilterFunction>()

inline fun saturate(
    value: Number,
): FilterFunction =
    "saturate($value)".unsafeCast<FilterFunction>()

inline fun saturate(
    value: Percent,
): FilterFunction =
    "saturate($value)".unsafeCast<FilterFunction>()

inline fun sepia(
    value: Number,
): FilterFunction =
    "sepia($value)".unsafeCast<FilterFunction>()

inline fun sepia(
    value: Percent,
): FilterFunction =
    "sepia($value)".unsafeCast<FilterFunction>()
