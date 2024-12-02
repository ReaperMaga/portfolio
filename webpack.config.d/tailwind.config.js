// must be in the jsMain/resource folder
const mainCssFile = 'styles.css';

// tailwind config (https://tailwindcss.com/docs/configuration)
const tailwind = {
    darkMode: 'media',
    plugins: [
        // require('@tailwindcss/forms') // optional
    ],
    variants: {},
    theme: {
        extend: {
            colors: {
                primary: {
                    DEFAULT: '#414288',
                    50: '#AAABD6',
                    100: '#9C9DD0',
                    200: '#8182C3',
                    300: '#6566B5',
                    400: '#4E4FA4',
                    500: '#414288',
                    600: '#34356C',
                    700: '#272751',
                    800: '#191A35',
                    900: '#0C0C1A',
                    950: '#06060C'
                },
                secondary: '#4BA3C3',
                background: {
                    DEFAULT: '#0F110C',
                    50: '#333928',
                    100: '#2F3525',
                    200: '#272C1F',
                    300: '#1F2319',
                    400: '#171A12',
                    500: '#0F110C',
                    600: '#0C0E0A',
                    700: '#0A0B08',
                    800: '#070806',
                    900: '#040504',
                    950: '#030403'
                },
            }
        },
    },
    content: {
        files: [
            '*.{js,html,css}',
            './kotlin/**/*.{js,html,css}'
        ],
        transform: {
            js: (content) => {
                return content.replaceAll(/(\\r)|(\\n)|(\\r\\n)/g, ' ')
            }
        }
    },
};


// webpack tailwind css settings
((config) => {
    let entry = '/kotlin/' + mainCssFile;
    config.entry.main.push(entry);
    config.module.rules.push({
        test: /\.css$/,
        use: [
            {loader: 'style-loader'},
            {loader: 'css-loader'},
            {
                loader: 'postcss-loader',
                options: {
                    postcssOptions: {
                        plugins: [
                            require("tailwindcss")({config: tailwind}),
                            require("autoprefixer"),
                            require("cssnano")
                        ]
                    }
                }
            }
        ]
    });
})(config);