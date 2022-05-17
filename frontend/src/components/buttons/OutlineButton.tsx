interface OutlineButtonProps {
    text: string
    className?: string
}

const OutlineButton = ({text, className = ""}: OutlineButtonProps) => {

    const classes = [
        "border border-sky-600 text-gray-400 px-4 py-2 transition hover:bg-sky-700 rounded-sm",
        className,
    ]

    return (
        <button className={classes.join(" ")}>{text}</button>
    )
}

export default OutlineButton

