import {DetailedHTMLProps, InputHTMLAttributes, ReactNode} from "react";

interface BottomLineInputProps extends DetailedHTMLProps<InputHTMLAttributes<HTMLInputElement>, HTMLInputElement>{
    type: string,
    placeholder: string,
    icon: ReactNode
}

const BottomLineInput = ({type, placeholder, icon, ...HTMLAttributes}: BottomLineInputProps) => {
    return (
        <div className="flex flex-col items-center space-y-2 space-x-3 w-1/2 h-20">
            <div className="flex items-center px-2 space-y-2 w-full">
                <span className="pt-2 text-2xl text-gray-400">{icon}</span>
                <input type={type} placeholder={placeholder} className="w-full text-gray-400 bg-transparent border-transparent focus:border-transparent focus:ring-0 shadow-sm"
                    {...HTMLAttributes} />
            </div>
            <div className="w-full h-px bg-sky-500"></div>
        </div>
    )
}

export default BottomLineInput
