// Automatically generated - do not modify!

@file:JsModule("@mui/material/Chip")
@file:JsNonModule

package mui.material

external interface ChipProps : react.Props {
    /**
     * The Avatar element to display.
     */
    var avatar: react.ReactElement

    /**
     * This prop isn't supported.
     * Use the `component` prop if you need to change the children structure.
     */
    var children: Nothing?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ChipClasses

    /**
     * If `true`, the chip will appear clickable, and will raise when pressed,
     * even if the onClick prop is not defined.
     * If `false`, the chip will not appear clickable, even if onClick prop is defined.
     * This can be used, for example,
     * along with the component prop to indicate an anchor Chip is clickable.
     * Note: this controls the UI and does not affect the onClick event.
     */
    var clickable: Boolean

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: Union /* 'default' | 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', ChipPropsColorOverrides */

    /**
     * Override the default delete icon element. Shown only if `onDelete` is set.
     */
    var deleteIcon: react.ReactElement

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * Icon element.
     */
    var icon: react.ReactElement

    /**
     * The content of the component.
     */
    var label: react.ReactNode

    /**
     * Callback fired when the delete icon is clicked.
     * If set, the delete icon will be shown.
     */
    var onDelete: react.dom.EventHandler<*>

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium', ChipPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The variant to use.
     * @default 'filled'
     */
    var variant: Union /* 'filled' | 'outlined', ChipPropsVariantOverrides */
}

/**
 * Chips represent complex entities in small blocks, such as a contact.
 *
 * Demos:
 *
 * - [Chips](https://mui.com/components/chips/)
 *
 * API:
 *
 * - [Chip API](https://mui.com/api/chip/)
 */
@JsName("default")
external val Chip: react.FC<ChipProps>